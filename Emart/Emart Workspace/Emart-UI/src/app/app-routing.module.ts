import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { CartComponent } from './cart/cart.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { AccountComponent } from './account/account.component';
import { SubCategoryComponent } from './sub-category/sub-category.component';

import { LoginComponent } from './login/login.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { SellerLoginComponent } from './seller-login/seller-login.component';
import { SellerSignUpComponent } from './seller-sign-up/seller-sign-up.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { ThankYouComponent } from './thank-you/thank-you.component';
import { ContactusComponent } from './contactus/contactus.component';
import { HomeComponent } from './home/home.component';
import { AddProductsComponent } from './add-products/add-products.component';
import { FashionComponent } from './fashion/fashion.component';
import { ElectronicsComponent } from './electronics/electronics.component';
import { SportsComponent } from './sports/sports.component';
import { HomeAcessComponent } from './home-acess/home-acess.component';
import { DisplayProductsComponent } from './display-products/display-products.component';


const routes: Routes = [{path:"",component:HomeComponent}, 
{path:"ct",component:CartComponent},
{path:"ac",component:AccountComponent},
{path:"pd/sb",component:SubCategoryComponent},
{path:"pd/sb/fas",component:FashionComponent} ,
{path:"pd/fas/ct",component:CartComponent} ,
{path:"pd/hma",component:HomeAcessComponent} ,
{path:"pd/ele",component:ElectronicsComponent} ,
{path:"pd/spt",component:SportsComponent} ,
{path:"cart",component:CartComponent},
{path:"pd",component:ProductComponent},
{path:"home",component:HomeComponent},
{path:"addp",component:AddProductsComponent},
{path:"pd/sb",component:SubCategoryComponent},
{path:"con",component:ContactusComponent},
{path:"cart/cko/cart/cko/tk/con",component:ContactusComponent},
{path:"el/ct",component:CartComponent},
{path:"cart/cko",component:CheckoutComponent},
{path:"ct/cko",component:CheckoutComponent},
{path:"cart/cko/cart/cko/tk",component:ThankYouComponent},
{path:"login",component:LoginComponent},
{path:"slogin",component:SellerLoginComponent},
{path:"signup",component: SignUpComponent},
{path:"cart/cko/tk",component: ThankYouComponent},
{path:"display",component: DisplayProductsComponent},
{path:"sellersign",component:SellerSignUpComponent},
{path:'**',component:PagenotfoundComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
