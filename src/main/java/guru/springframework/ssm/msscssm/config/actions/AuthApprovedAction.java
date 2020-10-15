package guru.springframework.ssm.msscssm.config.actions;

import guru.springframework.ssm.msscssm.domain.PaymentEvent;
import guru.springframework.ssm.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class AuthApprovedAction implements Action<PaymentState, PaymentEvent> {

    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> stateContext) {
        System.out.println("Sending Notification of Auth Approved");
    }
}
