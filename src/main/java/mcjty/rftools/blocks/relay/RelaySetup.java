package mcjty.rftools.blocks.relay;

import mcjty.lib.blocks.BaseBlock;
import mcjty.lib.builder.BlockFlags;
import mcjty.lib.container.GenericContainer;
import mcjty.rftools.blocks.ModBlocks;
import mcjty.rftools.setup.GuiProxy;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;


public class RelaySetup {
    public static BaseBlock relayBlock;


    @ObjectHolder("rftools:relay")
    public static TileEntityType<?> TYPE_RELAY;

    public static void init() {
        relayBlock = ModBlocks.builderFactory.<RelayTileEntity> builder("relay")
                .tileEntityClass(RelayTileEntity.class)
                .flags(BlockFlags.REDSTONE_CHECK)
                .emptyContainer()
                .guiId(GuiProxy.GUI_RELAY)
                .property(RelayTileEntity.ENABLED)
                .info("message.rftools.shiftmessage")
                .infoExtended("message.rftools.relay")
                .build();
    }

    @SideOnly(Side.CLIENT)
    public static void initClient() {
        relayBlock.initModel();
        relayBlock.setGuiFactory(GuiRelay::new);
    }
}
