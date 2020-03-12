import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeAcessComponent } from './home-acess.component';

describe('HomeAcessComponent', () => {
  let component: HomeAcessComponent;
  let fixture: ComponentFixture<HomeAcessComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeAcessComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeAcessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
