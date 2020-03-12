import { Seller } from './seller';
import { Customer } from './customer';

export class Transaction {
    txnId:number;
	customer:Customer;
	seller:Seller;
	transactionType:string;
	amount:number;
    txnDate:Date;
	DSCP:string;
}
