import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../entities/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  baseUrl: string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:3000/user";
  }

  getAll(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.baseUrl);
  }

  getUserDetailsById(userId: number): Observable<User> {
    return this.httpClient.get<User>(`${this.baseUrl}/${userId}`);
  }
  getUserByUserName(userName: string): Observable<User> {
    return this.httpClient.get<User>(`${this.baseUrl + "/username"}/${userName}`);
  }

  
}