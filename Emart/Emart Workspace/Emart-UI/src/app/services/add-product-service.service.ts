import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../entities/product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddProductServiceService {
  baseUrl:string;
  constructor(private httpClient:HttpClient) {
    this.baseUrl="http://localhost:4566/update";

   }


   getAllProducts() :Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.baseUrl+"/all");
  }


  addProduct(product:Product,categoryId:number,subCategoryId:number,sellerId:number) : Observable<Product>{
    return this.httpClient.post<Product>(this.baseUrl + "/product/" + categoryId + "/" + subCategoryId +"/" + sellerId,product);
                                       
  }
  searchById(productId:number) :Observable<Product>{
    return this.httpClient.get<Product>(`${this.baseUrl+"/products"}/${productId}`);
  }
 
}
