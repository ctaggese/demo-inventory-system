import { Component } from '@angular/core';
import { OrderControllerService } from '../../api/services';
import { CardModule } from 'primeng/card';
import { BehaviorSubject, Observable } from 'rxjs';
import { Order } from '../../api/models';
import { CommonModule, NgFor } from '@angular/common';

@Component({
  selector: 'app-orders-overview',
  standalone: true,
  imports: [CardModule,CommonModule],
  templateUrl: './orders-overview.component.html',
  styleUrl: './orders-overview.component.scss'
})
export class OrdersOverviewComponent {


  public orders:Observable<Order[]>;

  constructor(private orderService:OrderControllerService) {
    this.orders = this.orderService.getAllOrders();
   }

}
