import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `
    <app-user [user]="userData"></app-user>
  `
})
export class AppComponent {
  userData = {
    name: 'John Doe',
    email: 'johndoe@gmail.com',
    age: 35
  };
  question:{question:"par quoi doit-on remplacer ???? pour affecter cette propriete d'entree?", anwser:"[user]"}
}


