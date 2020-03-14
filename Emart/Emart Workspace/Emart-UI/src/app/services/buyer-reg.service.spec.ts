import { TestBed } from '@angular/core/testing';

import { BuyerRegService } from './buyer-reg.service';

describe('BuyerRegService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BuyerRegService = TestBed.get(BuyerRegService);
    expect(service).toBeTruthy();
  });
});
