package examples.queue;

public class Queue {

    public Queue() {
        _first = null;
        _last = null;
    }

    public void add(String item) {
        QueueItem queue_item = new QueueItem(item);
        if (_first == null) {
            _first = queue_item;
            _last = queue_item;
        } else {
            _last.setNext(queue_item);
            _last = queue_item;
        }
    }

    public String remove() {
        /*
         * BUG: NullPointerException if this method called with no elements in the
         * queue. -- uncomment this code to fix it
         */
        // if (isEmpty ())
        // throw new EmptyQueueException ();
        QueueItem first = _first;
        first = first.getNext();
        return first.getItem();
    }

    public boolean isEmpty() {
        return _first == null;
    }

    public void removeAll() {
        _first = null;
        _last = null;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("Queue[");
        for (QueueItem next = _first; next != null; next = next.getNext()) {
            if (next != _first) // parasoft-suppress PB.CUB.UEIC "Reviewed, this is intentionally"
                buffer.append(",");
            buffer.append(next.getItem());
        }
        buffer.append("]");
        return buffer.toString();
    }
    
    public int divide(int a, int b)
    {
        return a / b;
    }
    
    public int divide2(int a, int b)
    {
        return divide(a, b);
    }
        
    public int diviveByZero(int a)
    {
        return divide2(a, 0);
    }

    private QueueItem _first;

    private QueueItem _last;

    private class QueueItem {

        QueueItem(String item) {
            _item = item;
        }

        String getItem() {
            return _item;
        }

        QueueItem getNext() {
            return _next;
        }

        void setNext(QueueItem next) {
            _next = next;
        }

        private QueueItem _next;

        private String _item;
    }
}

class EmptyQueueException extends RuntimeException {
}
