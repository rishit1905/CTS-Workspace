import { Discount } from './discount';
import { Product } from './product';
import { Transaction } from './transaction';
import { Seller } from './seller';
import { Customer } from './customer';

export class PurchaseHistory {
    purchaseId:number;
	customer:Customer;
    seller:Seller;
    transaction:Transaction;
    product:Product[];
    discount:Discount;
	quantity:number;
    purchaseDate:Date;
}
