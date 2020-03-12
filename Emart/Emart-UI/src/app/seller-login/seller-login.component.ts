import { Component, OnInit } from '@angular/core';
import { User } from '../entities/user';
import { UserServiceService } from '../services/user-service.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-seller-login',
  templateUrl: './seller-login.component.html',
  styleUrls: ['./seller-login.component.css']
})
export class SellerLoginComponent {
  user:User
  msg: string;
  isNew: boolean;
  

  constructor(private userService: UserServiceService,
    private actRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {

    let userId = this.actRoute.snapshot.params.id;

    if (userId) {
      this.isNew = false;
      this.userService.getUserDetailsById(userId).subscribe(
        (data) => {
          this.user = data;
        }
      );
    } else {
      this.isNew = true;
      this.user = {
        userId: 0,
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