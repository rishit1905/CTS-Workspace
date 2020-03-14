import { Component, OnInit } from '@angular/core';
import { Product } from '../entities/product';
import { Category } from '../entities/category';
import { Seller } from '../entities/seller';
import { Address } from '../entities/address';
import { SubCategory } from '../entities/sub-category';
import { AddProductServiceService } from '../services/add-product-service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-add-products',
  templateUrl: './add-products.component.html',
  styleUrls: ['./add-products.component.css']
})
export class AddProductsComponent implements OnInit {

  product: Product;
  category: Category;
  seller: Seller;
  address: Address;
  subCategory: SubCategory;
  msg: string;
  isNew: boolean;
  constructor(private addProductService: AddProductServiceService,
    private actRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {



    let payId = this.actRoute.snapshot.params.productId;

    if (payId) {
      this.isNew = false;
      this.addProductService.searchById(payId).subscribe(
        (data) => {
          this.product = data;
        }
      );
    } else {
      this.isNew = true;
      this.product = {
        productId: 0,
        category: {
          categoryId: 0,
          categoryName: '',
          description: ''
        },
        subCategory: {
          subCategoryId: 0,
          subCategoryName: '',
          description: '',
          category: {
            categoryId: 0,
            categoryName: '',
            description: ''
          },
        },
        seller: {
          sellerId: 0,
          sellerName: '',
          emartUsers: {
            id: 0,
            userName: '',
            password: '',
            role: ''
          },
          gstIn: 0,
          companyName: '',
          aboutCompany: '',
          email: '',
          mobileNumber: '',
          createdDate: new Date,
          address: {
            line1: '',
            line2: '',
            city: '',
            state: '',
            pincode: ''
          }
        },
        productName: '',
        price: 0,
        description: '',
        stock: 0



      };
    }

  }
  save() {
    let ob: Observable<Product>;

    if (this.isNew) {
      ob = this.addProductService.addProduct(this.product, this.product.category.categoryId, this.product.subCategory.subCategoryId, this.product.seller.sellerId);
    }
    ob.subscribe(
      (data) => {

        this.router.navigateByUrl("/display");
      },
      (errResponse) => {
        this.msg = errResponse.error;

      }
    );
  }

}

