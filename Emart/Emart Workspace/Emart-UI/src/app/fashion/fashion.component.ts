import { Component, OnInit, Injectable } from '@angular/core';
import { Product } from '../entities/productLc';
import { ProductService } from '../services/product.service';

@Injectable({
  providedIn: 'root'
})
@Component({
  selector: 'app-fashion',
  templateUrl: './fashion.component.html',
  styleUrls: ['./fashion.component.css']
})
export class FashionComponent implements OnInit {

  private products: Product[];

	constructor(
		private productService: ProductService
	) { }

	ngOnInit() {
		this.products = this.productService.findAll();
	}


}
