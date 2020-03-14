import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Payment } from '../entities/payment';
import { PaymentService } from '../services/payment.service';
import { Injectable, Component, OnInit } from '@angular/core';
import { DeliveryAddress } from '../entities/delivery-address';

@Injectable({
	providedIn: 'root'
})
@Component({
	selector: 'app-checkout',
	templateUrl: './checkout.component.html',
	styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
	pay: Payment;
	
	msg: string;
	isNew: boolean;

	constructor(private paymentService: PaymentService,
		private actRoute: ActivatedRoute,
		private router: Router) { }

	ngOnInit(): void {

		let payId = this.actRoute.snapshot.params.id;
	


		if (payId) {
			this.isNew = false;
			this.paymentService.getUserDetailsById(payId).subscribe(
				(data) => {
					this.pay = data;
				}
			);
			
		} else {
			this.isNew = true;

			this.pay = {
				payId: 0,
				nameOnCard: '',
				creditCardNumber: '',
				expiryMonth: '',
				expiryYear: '',
				cvv: 0,
				delivery: {
					fullName: '',

					email: '',

					address: '',

					city: '',
					state: '',

					zipcode: 0

				}
			};

		}

	}

	save() {
		let ob: Observable<Payment>;
		

		if (this.isNew) {
			ob = this.paymentService.addPayment(this.pay);
			
		}
		ob.subscribe(
			(data) => {

				this.router.navigateByUrl("/cart/cko/tk");
			},

			(errResponse) => {
				this.msg = errResponse.error;

			}
		);
	}
}	
