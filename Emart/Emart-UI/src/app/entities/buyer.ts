import { Address } from './address';
import { User } from './user';

export class Buyer extends User {
   public firstName:string;
   public  lastName:string;
	public  emailId:string;
	public  mobileNumber:string;
	public  address:Address;
}
