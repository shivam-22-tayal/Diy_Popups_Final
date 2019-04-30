import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllAdvtComponent } from './all-advt.component';

describe('AllAdvtComponent', () => {
  let component: AllAdvtComponent;
  let fixture: ComponentFixture<AllAdvtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllAdvtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllAdvtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
