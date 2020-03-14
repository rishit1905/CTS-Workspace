import { Injectable } from '@angular/core';

import { Product } from '../entities/productLc';

@Injectable()
export class ProductService {

    private products: Product[];


    constructor() {
        this.products = [
            { id: 'p01', name: 'Barbie Attire', price: 2000, photo: "/assets/fashion/peach.jpg" },
            { id: 'p02', name: 'Red frock', price: 4000, photo: "/assets/fashion/redf.jpg" },
            { id: 'p03', name: 'Raindow frock', price: 1400, photo: "/assets/fashion/rainbow.jpg" },
            { id: 'p04', name: 'Blue Men', price: 200, photo: "/assets/fashion/blue_men.jpg" },
            { id: 'p05', name: 'Pink Frock', price: 4000, photo: "/assets/fashion/pink_frock.jpg" },
            { id: 'p06', name: 'Light Blue', price: 1400, photo: "/assets/fashion/light_blue.jpg" },

        ];
    }

    findAll(): Product[] {
        return this.products;
    }

    find(id: string): Product {
        return this.products[this.getSelectedIndex(id)];
    }

    private getSelectedIndex(id: string) {
        for (var i = 0; i < this.products.length; i++) {
            if (this.products[i].id == id) {
                return i;
            }
        }
        return -1;
    }

}