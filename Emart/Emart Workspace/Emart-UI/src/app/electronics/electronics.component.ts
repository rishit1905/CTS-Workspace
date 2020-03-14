import { Component, OnInit, Injectable } from '@angular/core';
import { Product } from '../entities/productLc';

@Injectable({
  providedIn: 'root'
})
@Component({
  selector: 'app-electronics',
  templateUrl: './electronics.component.html',
  styleUrls: ['./electronics.component.css']
})
export class ElectronicsComponent implements OnInit {

  private eproducts: Product[];

	constructor(
		
	) { }

	ngOnInit() {
		
	}


}


