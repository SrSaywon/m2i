import { Injectable } from '@angular/core';
import { Observable, map, mapTo } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceObservableService {

  constructor() { }

  countdown() {
    return new Observable<number>((subscriber) => {
      let count = 0

      setInterval(() => {
        if (count === 25) {
          subscriber.complete()
        }
        subscriber.next(++count)
      }, 1000)
    })
  }
}
