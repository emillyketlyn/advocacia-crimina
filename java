import { Switch, Route, Router as WouterRouter } from "wouter";
import { QueryClient, QueryClientProvider } from "@tanstack/react-query";
// ...imports de páginas

const queryClient = new QueryClient();

function Router() {
  return (
    <Layout>
      <Switch>
        <Route path="/" component={Dashboard} />
        <Route path="/clientes" component={ClientesList} />
        <Route path="/clientes/:id" component={ClienteDetail} />
        <Route path="/processos" component={ProcessosList} />
        <Route path="/processos/novo" component={ProcessoForm} />
        <Route path="/processos/:id" component={ProcessoDetail} />
        <Route path="/audiencias" component={AudienciasList} />
        <Route path="/prazos" component={PrazosList} />
        <Route component={NotFound} />
      </Switch>
    </Layout>
  );
}
