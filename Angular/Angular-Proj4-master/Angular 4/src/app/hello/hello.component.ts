import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent {

  userName: String;

  constructor() { 
    this.userName="Buddy";
  }

  greet=()=>{
    alert(`Hello ${this.userName}! Welcome to our world!`);
  }
}
