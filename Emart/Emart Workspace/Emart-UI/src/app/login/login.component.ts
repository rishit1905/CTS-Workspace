import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';

import { ActivatedRoute, Router } from '@angular/router';
import { LoginServiceService } from '../services/login-service.service';
import { EmartUsers } from '../entities/emart-users';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  emartUsers:EmartUsers;
  msg: string;
  isNew: boolean;
  loginForm: FormGroup;
  
  error_messages = {

    'userName': [
      { type: 'required', message: 'userName is required.' },
      { type: 'minlength', message: 'userName length is too short.' },
      { type: 'maxlength', message: 'Invalid userName length.' }
    ],

    'password': [
      { type: 'required', message: 'Password is required.' },
      { type: 'minlength', message: 'Password length is too short.' },
      { type: 'maxlength', message: 'Password length is too long.' }
    ]
  }

  constructor(private userService: LoginServiceService,
    private actRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {

    let userId = this.actRoute.snapshot.params.id;

    if (userId) {
      this.isNew = false;
      this.userService.getUserDetailsById(userId).subscribe(
        (data) => {
          this.emartUsers = data;
        }
      );
    } else {
      this.isNew = true;
      this.emartUsers = {
        id: 0,
        userName: '',
        password: '',
        role: ''
      };
    }

  }
  signIn(){
    if(localStorage){
      var name=(<HTMLInputElement>document.getElementById("userName")).value;
      localStorage.setItem("id",name);
      let id=localStorage.getItem("id");
      this.router.navigateByUrl("");
    }
  }
  
}	



  


