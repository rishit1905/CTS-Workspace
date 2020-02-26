import { TestBed } from '@angular/core/testing';

import { ArthService } from './arth.service';

describe('ArthService', () => {
  let service: ArthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.get(ArthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  describe('add',()=>{
    
    it('should return a positive value when operands are positve',()=>{
      let result = service.add(10,10);
      expect(result).toBe(20);
    });

    it('should return a negative value when operands are negative',()=>{
      expect(service.add(-10,-10)).toBe(-20);
    });

    it('should return itself on addition with operator identity',()=>{
      expect(service.add(10,0)).toBe(10);
      expect(service.add(0,10)).toBe(10);
    });
  }); 
});
