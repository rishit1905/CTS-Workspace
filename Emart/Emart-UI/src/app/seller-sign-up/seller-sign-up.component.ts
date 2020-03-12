import { Component, OnInit } from '@angular/core';
import { Seller } from '../entities/seller';
import { Address } from '../entities/address';
import { ActivatedRoute, Router } from '@angular/router';
import { SellerRegService } from '../services/seller-reg.service';
import { Observable } from 'rxjs';
import { EmartUsers } from '../entities/emart-users';


@Component({
  selector: 'app-seller-sign-up',
  templateUrl: './seller-sign-up.component.html',
  styleUrls: ['./seller-sign-up.component.css']
})
export class SellerSignUpComponent implements OnInit {

  user: Seller;
  emartUsers: EmartUsers;
  msg: string;
  isNew: boolean;
  address: Address;

  constructor(private sellerService: SellerRegService,
    private actRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {

    let id = this.actRoute.snapshot.params.sellerId;

    if (id) {
      this.isNew = false;
      this.sellerService.getSellerById(id).subscribe(
        (data) => {
          this.user = data;
        }
      );
    } else {
      this.isNew = true;
      this.user = {
        sellerId:0,
        sellerName: '',
        companyName: '',
        aboutCompany: '',
        email: '',
        mobileNumber: '',
        gstIn: 0,
        address: {
          line1: '',
          line2: '',
          city: '',
          state: '',
          pincode: ''
        },
        emartUsers: {
          id: 0,
          userName: '',
          password: '',
          role: 'SELLER'
        },
        createdDate:new Date
      };
    }

  }
  save() {
    let ob: Observable<Seller>;

    if (this.isNew) {
      ob = this.sellerService.addSeller(this.user);
    }
    ob.subscribe(
      (data) => {

        this.router.navigateByUrl("/home");
      },
      (errResponse) => {
        this.msg = errResponse.error;

      }
    );
  }
}


