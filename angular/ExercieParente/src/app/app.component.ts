import { Component } from '@angular/core';
import ContactChild from './models/ContactChild.models';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EcercieParente';
  contacts: ContactChild [] = []

  addContact(contact: ContactChild) {
    this.contacts = [...this.contacts, contact]
  }
}
