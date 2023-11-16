import { Component } from '@angular/core';
import { ServiceObservableService } from '../service/service-observable.service';

@Component({
  selector: 'app-component-observable',
  templateUrl: './component-observable.component.html',
  styleUrls: ['./component-observable.component.css']
})
export class ComponentObservableComponent {
  affichage = "A"

  constructor(
    private obsServ : ServiceObservableService
  ) {}

  clickHandler() {
    this.obsServ.countdown()
    .subscribe({
      next: (number) => {
        this.affichage = String.fromCharCode(number + 65) // 65 = 'A' dans le ASCII code
      },
      error(err) {
        console.error("On a eu une erreur!");
        console.log(err);
      },
      complete() {
        console.log("Alphabet terminé");
      },
    })
  }

  
}
