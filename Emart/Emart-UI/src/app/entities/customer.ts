import { Address } from './address';
import { EmartUsers } from './emart-users';

export class Customer {
	public customerId:number;
  	public firstName:string;
	public  lastName:string;
	public emartUsers:EmartUsers;
	public  email:string;
	public  mobile:string;
	public createdDate:Date;
	public  address:Address;
}
