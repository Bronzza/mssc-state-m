package com.example.mssc_state_m.services;

import com.example.mssc_state_m.domain.PaymentEvent;
import com.example.mssc_state_m.domain.PaymentState;
import com.example.mssc_state_m.repositories.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.StateMachineInterceptorAdapter;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class PaymentStateChangeListener extends StateMachineInterceptorAdapter<PaymentState, PaymentEvent> {

    private final PaymentRepository paymentRepository;

    @Override
    public void preStateChange(State<PaymentState, PaymentEvent> state,
                               Message<PaymentEvent> message,
                               Transition<PaymentState, PaymentEvent> transition,
                               StateMachine<PaymentState, PaymentEvent> stateMachine) {
        super.preStateChange(state, message, transition, stateMachine);
    }
}
