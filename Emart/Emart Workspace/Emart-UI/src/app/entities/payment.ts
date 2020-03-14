import { DeliveryAddress } from './delivery-address';

export class Payment {
    public payId:number;
    public  nameOnCard:string;
	public  creditCardNumber:string;
	public  expiryMonth:string;
	public  expiryYear:string;
	public  cvv: number ;
	public delivery:DeliveryAddress;
}


