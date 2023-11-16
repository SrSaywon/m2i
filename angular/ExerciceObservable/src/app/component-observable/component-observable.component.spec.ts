import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentObservableComponent } from './component-observable.component';

describe('ComponentObservableComponent', () => {
  let component: ComponentObservableComponent;
  let fixture: ComponentFixture<ComponentObservableComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ComponentObservableComponent]
    });
    fixture = TestBed.createComponent(ComponentObservableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
