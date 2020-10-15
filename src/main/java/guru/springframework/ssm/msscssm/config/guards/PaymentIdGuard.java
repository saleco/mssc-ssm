package guru.springframework.ssm.msscssm.config.guards;

import guru.springframework.ssm.msscssm.domain.PaymentEvent;
import guru.springframework.ssm.msscssm.domain.PaymentState;
import guru.springframework.ssm.msscssm.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {
    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> stateContext) {
        return stateContext.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}
