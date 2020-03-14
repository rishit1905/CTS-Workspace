import { TestBed } from '@angular/core/testing';

import { ProductDService } from './product-d.service';

describe('ProductDService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductDService = TestBed.get(ProductDService);
    expect(service).toBeTruthy();
  });
});
