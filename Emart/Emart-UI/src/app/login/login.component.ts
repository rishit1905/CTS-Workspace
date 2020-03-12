import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { User } from '../entities/user';

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
      localStorage.setItem("userId",name);
      let id=localStorage.getItem("userId");
      this.router.navigateByUrl("");
    }
  }
  
}	



  


