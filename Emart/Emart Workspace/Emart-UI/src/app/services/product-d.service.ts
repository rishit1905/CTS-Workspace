import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../entities/product';

@Injectable({
  providedIn: 'root'
})
export class ProductDService  {

  baseUrl: string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:4565/search";
  }

  getAllProducts():Observable<Product[]>{
    return this.httpClient.get<Product[]>(this.baseUrl+"/products");
  }
  // getById(productId: number): Observable<Product> {
  //   return this.httpClient.get<Product>(`${this.baseUrl}/${productId}`);
  // }
  // add(pro: Product): Observable<Product> {
  //   console.log("url hit" + pro.productName);
  //   return this.httpClient.post<Product>(this.baseUrl, pro);
  // }
}
