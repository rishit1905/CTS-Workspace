import { Category } from './category';
import { Seller } from './seller';
import { SubCategory } from './sub-category';

export class Product {

    productId:number;
	category:Category;
	subCategory:SubCategory;
	seller:Seller;
	productName:string;
	price:number;
	description:string;
    stock:number;
    // photo: string;

}