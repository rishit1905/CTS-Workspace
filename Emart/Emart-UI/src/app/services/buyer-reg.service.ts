import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Buyer } from '../entities/buyer';
import { Customer } from '../entities/customer';

@Injectable({
  providedIn: 'root'
})
export class BuyerRegService {

  baseUrl: string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:4567/customer";
  }

  addCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post<Customer>(this.baseUrl + "/signup", customer);

  }

  getAll(): Observable<Buyer[]> {
    return this.httpClient.get<Buyer[]>(this.baseUrl);
  }

  getCustomerById(customerId: number): Observable<Customer> {
    return this.httpClient.get<Customer>(`${this.baseUrl}/${customerId}`);
  }
  getBuyerByUserName(userName: string): Observable<Buyer> {
    return this.httpClient.get<Buyer>(`${this.baseUrl + "/Buyer/username"}/${userName}`);
  }



  updateBuyer(user: Buyer): Observable<Buyer> {
    return this.httpClient.put<Buyer>(this.baseUrl, user);
  }

  delete(id: number): Observable<Buyer> {
    return this.httpClient.delete<Buyer>(`${this.baseUrl + "/Buyer"}/${id}`);
  }
}
