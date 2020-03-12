import { Address } from './address';
import { EmartUsers } from './emart-users';

export class Seller {
    public sellerId:number;
    public sellerName: string;
    public emartUsers:EmartUsers;
    public gstIn: number;
    public companyName: string;
    public aboutCompany: string;
    public email: string;
    public mobileNumber: string;
    public createdDate:Date;
    public address: Address;
}


