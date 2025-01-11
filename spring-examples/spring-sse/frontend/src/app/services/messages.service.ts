import {Injectable, signal} from '@angular/core';

type Message = {
  from: string;
  content: string
}

@Injectable({
  providedIn: 'root'
})
export class MessagesService {
  private sseSource = new EventSource(`http://localhost:666/api/v1/messages/stream`);

  constructor() {
    this.sseSource.addEventListener('message', (e: MessageEvent) => {
      const message = JSON.parse(e.data);

      this.messages.update(messages => [...messages, message])
    });
  }

  messages = signal<Message[]>([])
}
