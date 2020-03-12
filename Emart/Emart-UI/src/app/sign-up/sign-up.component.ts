import { Component, OnInit } from '@angular/core';
import { BuyerRegService } from '../services/buyer-reg.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Address } from '../entities/address';
import { Customer } from '../entities/customer';


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

	constructor(private regService: BuyerRegService,
		private actRoute: ActivatedRoute,
		private router: Router) { }

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
					id:0,
					userName:'',
					password:'',
					role:'Customer'
				},
				email:'',
				mobile:'',
				createdDate:new Date,
				address: {
					line1 :'',
					line2 :'',
					city:'',
					state:'',
					pincode:''
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
}



