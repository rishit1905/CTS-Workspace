import { Component, OnInit } from '@angular/core';
import { Product } from '../entities/product';
import { ProductDService } from '../services/product-d.service';



@Component({
  selector: 'app-display-products',
  templateUrl: './display-products.component.html',
  styleUrls: ['./display-products.component.css']
})
export class DisplayProductsComponent implements OnInit {

  pro:Product[];
  errMsg:string;
  
  constructor(private proService :ProductDService) { }

  ngOnInit() {
   this.loadData();
  }
  loadData(){
    this.errMsg=null;
    
    this.proService.getAllProducts().subscribe(
      (data)=>{this.pro=data;},
      (err)=>{this.errMsg="Sorry unable to load";}
    );
  }
}
