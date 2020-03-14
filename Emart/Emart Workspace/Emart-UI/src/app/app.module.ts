import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { CartComponent } from './cart/cart.component';
import { AccountComponent } from './account/account.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { HeaderComponent } from './header/header.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { SubCategoryComponent } from './sub-category/sub-category.component';

import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SellerLoginComponent } from './seller-login/seller-login.component';
import { SellerSignUpComponent } from './seller-sign-up/seller-sign-up.component';
import { ProductService } from './services/product.service';
import { CheckoutComponent } from './checkout/checkout.component';
import { ThankYouComponent } from './thank-you/thank-you.component';
import { ContactusComponent } from './contactus/contactus.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { AddProductsComponent } from './add-products/add-products.component';
import { FashionComponent } from './fashion/fashion.component';
import { ElectronicsComponent } from './electronics/electronics.component';
import { SportsComponent } from './sports/sports.component';
import { HomeAcessComponent } from './home-acess/home-acess.component';
import { PaymentService } from './services/payment.service';
import { HttpClientModule } from '@angular/common/http';
import { DisplayProductsComponent } from './display-products/display-products.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    CartComponent,
    AccountComponent,
    PagenotfoundComponent,
    HeaderComponent,
    NavBarComponent,
    SubCategoryComponent,

    LoginComponent,
    SignUpComponent,
    SellerLoginComponent,
    SellerSignUpComponent,
    CheckoutComponent,
    ThankYouComponent,
    ContactusComponent,
    HomeComponent,
    FooterComponent,
    AddProductsComponent,
    FashionComponent,
    ElectronicsComponent,
    SportsComponent,
    HomeAcessComponent,
    DisplayProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    AngularFontAwesomeModule,
    HttpClientModule
  ],
  providers: [ProductService,PaymentService],

  bootstrap: [AppComponent]
})
export class AppModule { }
