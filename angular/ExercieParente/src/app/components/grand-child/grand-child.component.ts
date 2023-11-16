import { Component, Input } from '@angular/core';
import ContactChild from 'src/app/models/ContactChild.models';

@Component({
  selector: 'app-grand-child',
  templateUrl: './grand-child.component.html',
  styleUrls: ['./grand-child.component.css']
})
export class GrandChildComponent {
  
  @Input()
  contacts: ContactChild[] = []
}
