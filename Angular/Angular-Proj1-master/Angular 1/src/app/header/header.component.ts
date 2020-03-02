import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  webTitle:String;
  welcomeImage:String;
  welcomeText:String;

  constructor() { 
    this.webTitle="Angular SPA Demo App";
    this.welcomeText="..Hi all, welcome to angular demo app..";
    this.welcomeImage="assets/images/namaste.png";
  }

}
