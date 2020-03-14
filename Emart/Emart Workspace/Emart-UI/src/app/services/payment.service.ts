import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Payment } from '../entities/payment';

@Injectable({
  providedIn:'root'
})
export class PaymentService {
  baseUrl:string;

  constructor(private httpClient:HttpClient) {
    this.baseUrl="http://localhost:4565/payments";
   }

   getAllUsers() :Observable<Payment[]>{
     return this.httpClient.get<Payment[]>(this.baseUrl);
   }

   getUserDetailsById(id:number) :Observable<Payment>{
     return this.httpClient.get<Payment>(`${this.baseUrl}/${id}`);
   }

   addPayment(user:Payment) : Observable<Payment>{
     return this.httpClient.post<Payment>(this.baseUrl + "/payments",user);

   }

  //  updateUser(user:Payment) : Observable<Payment>{
  //     return this.httpClient.put<Payment>(this.baseUrl,user);
  //  }

  //  delete(id:number) :Observable<Payment>{
  //    return this.httpClient.delete<Payment>(`${this.baseUrl + "/users"}/${id}`);
  //  }
}
