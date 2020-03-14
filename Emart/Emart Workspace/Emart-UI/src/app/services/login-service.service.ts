import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmartUsers } from '../entities/emart-users';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {
  baseUrl: string;

  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:4567/login";
  }

  getAllUsers(): Observable<EmartUsers[]> {
    return this.httpClient.get<EmartUsers[]>(this.baseUrl);
  }

  searchByUserName(userName: string,password:string): Observable<EmartUsers> {
    return this.httpClient.get<EmartUsers>(this.baseUrl + "/"+userName+"/"+password);
  }
  getUserDetailsById(userId: number): Observable<EmartUsers> {
    return this.httpClient.get<EmartUsers>(`${this.baseUrl}/${userId}`);
  }
  
}