import { Component, Output, EventEmitter } from '@angular/core';
import ContactChild from 'src/app/models/ContactChild.models';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  newContact: ContactChild = {
    firstname: "",
    lastname: "",
    email: "",
    phoneNumber: ""
  }

  @Output('onAddContact')
  addContact = new EventEmitter<ContactChild>()

  contactFromSubmit(event: Event) {
    event.preventDefault()


    
    this.addContact.emit(this.newContact)

    this.newContact = {
      firstname: "",
      lastname: "",
      email: "",
      phoneNumber: ""
    }
  }
}
