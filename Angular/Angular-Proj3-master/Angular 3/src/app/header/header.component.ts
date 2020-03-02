import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  welcomeText:String;
  welcomeImage:String;
  headerText:String;

  constructor() { 
    this.welcomeImage="assets/images/namaste.png";
    this.headerText="ANGULAR APPLICATION";
    this.welcomeText="Hi ! Everyone ! Thank you for being here";
  }


}
