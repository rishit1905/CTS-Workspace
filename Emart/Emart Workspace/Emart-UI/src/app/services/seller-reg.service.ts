import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Seller } from '../entities/seller';

@Injectable({
  providedIn: 'root'
})
export class SellerRegService {

  baseUrl: string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:4567/seller";
  }

  getAll(): Observable<Seller[]> {
    return this.httpClient.get<Seller[]>(this.baseUrl);
  }

  getSellerById(sellerId: number): Observable<Seller> {
    return this.httpClient.get<Seller>(`${this.baseUrl + "/Seller"}/${sellerId}`);
  }
  getSellerByUserName(userName: string): Observable<Seller> {
    return this.httpClient.get<Seller>(`${this.baseUrl + "/Seller/username"}/${userName}`);
  }

  addSeller(seller:Seller) : Observable<Seller>{
    return this.httpClient.post<Seller>(this.baseUrl + "/signup",seller);

  }

  updateSeller(user: Seller): Observable<Seller> {
    return this.httpClient.put<Seller>(this.baseUrl, user);
  }

  delete(id: number): Observable<Seller> {
    return this.httpClient.delete<Seller>(`${this.baseUrl + "/Seller"}/${id}`);
  }
}