import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  public itemsMenu=[
    {
      name:'Home',
      route:''
    },
    {
      name:'Register',
      route:''
    },
    {
      name:'ATM',
      route:''
    }
  ]

}
