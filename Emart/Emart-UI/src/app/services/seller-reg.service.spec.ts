import { TestBed } from '@angular/core/testing';

import { SellerRegService } from './seller-reg.service';

describe('SellerRegService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SellerRegService = TestBed.get(SellerRegService);
    expect(service).toBeTruthy();
  });
});
