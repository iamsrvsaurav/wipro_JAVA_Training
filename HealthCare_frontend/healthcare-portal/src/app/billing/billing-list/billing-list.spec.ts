import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillingList } from './billing-list';

describe('BillingList', () => {
  let component: BillingList;
  let fixture: ComponentFixture<BillingList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BillingList]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BillingList);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
