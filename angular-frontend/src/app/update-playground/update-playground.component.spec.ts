import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatePlaygroundComponent } from './update-playground.component';

describe('UpdatePlaygroundComponent', () => {
  let component: UpdatePlaygroundComponent;
  let fixture: ComponentFixture<UpdatePlaygroundComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdatePlaygroundComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatePlaygroundComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
