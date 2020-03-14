import { Component, OnInit } from '@angular/core';
import { BuyerRegService } from '../services/buyer-reg.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Address } from '../entities/address';
import { Customer } from '../entities/customer';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';


@Component({
	selector: 'app-sign-up',
	templateUrl: './sign-up.component.html',
	styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

	customer: Customer;
	msg: string;
	isNew: boolean;
	address: Address;
	loginForm: FormGroup;

	constructor(private regService: BuyerRegService,
		private actRoute: ActivatedRoute,
		private router: Router,
		public formBuilder: FormBuilder) {
		this.loginForm = this.formBuilder.group({
			fname: new FormControl('', Validators.compose([
				Validators.required
			])),
			lname: new FormControl('', Validators.compose([
				Validators.required
			])),
			email: new FormControl('', Validators.compose([
				Validators.required,
				Validators.email,
				Validators.minLength(3),
				Validators.maxLength(30)
			])),
			mobile: new FormControl('', Validators.compose([
				Validators.required,
				Validators.minLength(10)
			])),
			password: new FormControl('', Validators.compose([
				Validators.required,
				Validators.minLength(8),
				Validators.maxLength(20)
			])),
			confirmpassword: new FormControl('', Validators.compose([
				Validators.required,
				Validators.minLength(8),
				Validators.maxLength(20)
			])),
		}, {
			validators: this.password.bind(this)
		});
	}

	ngOnInit(): void {

		let id = this.actRoute.snapshot.params.customerId;

		if (id) {
			this.isNew = false;
			this.regService.getCustomerById(id).subscribe(
				(data) => {
					this.customer = data;
				}
			);
		} else {
			this.isNew = true;
			this.customer = {
				customerId: 0,
				firstName: '',
				lastName: '',
				emartUsers: {
					id: 0,
					userName: '',
					password: '',
					role: 'Customer'
				},
				email: '',
				mobile: '',
				createdDate: new Date,
				address: {
					line1: '',
					line2: '',
					city: '',
					state: '',
					pincode: ''
				}
			};
		}

	}

	save() {
		let ob: Observable<Customer>;

		if (this.isNew) {
			ob = this.regService.addCustomer(this.customer);
		}
		ob.subscribe(
			(data) => {

				this.router.navigateByUrl("/home");
			},
			(errResponse) => {
				this.msg = errResponse.error;

			}
		);
	}

	error_messages = {
		'fname': [
			{ type: 'required', message: 'First Name is required.' },
		],

		'lname': [
			{ type: 'required', message: 'Last Name is required.' }
		],

		'email': [
			{ type: 'required', message: 'Email is required.' },
			{ type: 'minlength', message: 'Email length is too short.' },
			{ type: 'maxlength', message: 'Invalid Email length.' },
			{ type: 'email', message: 'Please enter valid email ID!' }
		],

		'mobile': [
			{ type: 'required', message: 'Mobile number is required.' },
			{ type: 'minlength', message: 'Invalid mobile number.' }
		],

		'password': [
			{ type: 'required', message: 'Password is required.' },
			{ type: 'minlength', message: 'Password length is too short.' },
			{ type: 'maxlength', message: 'Password length is too long.' }
		],
		'confirmpassword': [
			{ type: 'required', message: 'Password is required.' },
			{ type: 'minlength', message: 'Password length is too short. ' },
			{ type: 'maxlength', message: 'Password length is too long.' }
		],
	}



	password(formGroup: FormGroup) {
		const { value: password } = formGroup.get('password');
		const { value: confirmPassword } = formGroup.get('confirmpassword');
		return password === confirmPassword ? null : { passwordNotMatch: true };
	}
}



