# Customer Support MCP Server

`customer-support-mcp` is an MCP (Model Context Protocol) server that enables an AI support agent to interact with customer and order-management systems.

The server provides tools to:

* 🔍 Query customer/user information
* 📦 Retrieve customer orders and order details
* 💰 Process refunds
* 🎫 Create and update support tickets
* 🤖 Enable AI agents to perform customer-support workflows through MCP tools

## MCP Server

**Server name:** `customer-support-mcp`

**Purpose:** Provide customer-support and order-management capabilities to AI agents through the Model Context Protocol.

### Available Tools

| Tool            | Description                                |
| --------------- | ------------------------------------------ |
| `get_user`      | Retrieve customer/user information         |
| `get_orders`    | Retrieve orders for a customer             |
| `get_order`     | Retrieve details of a specific order       |
| `create_refund` | Process a refund for an eligible order     |
| `update_ticket` | Update an existing customer-support ticket |

## Architecture

```text
                    AI Support Agent
                           |
                           | MCP
                           v
                 customer-support-mcp
                           |
            +--------------+--------------+
            |              |              |
            v              v              v
          Users          Orders        Tickets
                           |
                           v
                        Refunds
```

The MCP server acts as the bridge between the AI agent and the underlying customer-support systems, allowing the agent to retrieve information and perform authorized actions through well-defined MCP tools.

## MCP Registry

The official MCP ecosystem provides a registry for discovering and publishing MCP servers:

https://registry.modelcontextprotocol.io/

For more information about Model Context Protocol, see the official MCP documentation.
